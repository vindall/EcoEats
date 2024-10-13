package com.example.main;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignInActivity extends AppCompatActivity {

    private EditText emailEditText, passwordEditText;
    private Button loginButton;
    private FirebaseAuth mAuth;
    private SharedPreferences sharedPreferences;

    private TextView tvCreateAcc;
    private static final String PREFS_NAME = "MyPrefs";
    private static final String KEY_EMAIL = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        emailEditText = findViewById(R.id.signin_tv_email);
        passwordEditText = findViewById(R.id.signin_tv_password);
        loginButton = findViewById(R.id.roundedButton);
        tvCreateAcc = findViewById(R.id.signin_tv_createacc);

        FirebaseApp.initializeApp(this);

        mAuth = FirebaseAuth.getInstance();
        sharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });

        tvCreateAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
                finish();
            }
        });
        // Check if user is already logged in
//        if (isLoggedIn()) {
//            redirectToMain(); // Example method to redirect to main activity
//        }
    }

    private void signIn() {
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        // Validate email and password
        if (isValidCredentials(email, password)) {
            // Sign in with Firebase Authentication
            mAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Save email to SharedPreferences
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString(KEY_EMAIL, email);
                                editor.apply();

                                // Example: Redirect to main activity
//                                Toast.makeText(SignInActivity.this, "SUKSES", Toast.LENGTH_SHORT).show();
                                redirectToMain();
                            } else {
                                Toast.makeText(SignInActivity.this, "Authentication failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        } else {
            Toast.makeText(SignInActivity.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
        }
    }



    private boolean isValidCredentials(String email, String password) {
        // Add your validation logic here, e.g., checking email format, password length, etc.
        return !email.isEmpty() && !password.isEmpty();
    }

    private boolean isLoggedIn() {
        // Check if email exists in SharedPreferences
        return sharedPreferences.contains(KEY_EMAIL);
    }

    private void redirectToMain() {
        // Example method to redirect to main activity
        startActivity(new Intent(SignInActivity.this, home_final.class));
        finish(); // Finish current activity
    }
}
