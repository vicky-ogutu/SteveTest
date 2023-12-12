package com.bodaride.stevetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class Login extends AppCompatActivity {
    
    Button  btnLogin;
    EditText uname, passwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        btnLogin =findViewById(R.id.login_btn);
        uname =findViewById(R.id.username_edt);
        passwd =findViewById(R.id.password_edt);
        
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (uname.getText().toString().isEmpty()){
                    Toast.makeText(Login.this, "", Toast.LENGTH_SHORT).show();
                    
                }
                else if (passwd.getText().toString().isEmpty()){
                    Toast.makeText(Login.this, "", Toast.LENGTH_SHORT).show();

                    
                }else{
                    login();
                }
            }
        });
        
    }
    private void login(){

//private void loginRequest() {

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("msisdn", uname.getText().toString());
            //jsonObject.put("msisdn", "0712311264");
            jsonObject.put("password", passwd.getText().toString());
            //jsonObject.put("password", "12345678");

        } catch (JSONException e) {
            e.printStackTrace();
        }



        // AndroidNetworking.initialize(getApplicationContext(), myUnsafeHttpClient());
       /* AndroidNetworking.post(z+Constants.LOGIN)
                .addHeaders("Content-Type", "application.json")
                // .addHeaders("Accept", "gzip, deflate, br")
                .addHeaders("Connection","keep-alive")
                .addHeaders("Accept", "application/json")
                .addJSONObjectBody(jsonObject) // posting json
                .setPriority(Priority.MEDIUM)
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // do anything with response

//                        Log.e(TAG, response.toString());

                        if (pDialog != null && pDialog.isShowing()) {
                            pDialog.hide();
                            pDialog.cancel();
                        }

                        try {
                            String auth_token = response.has("auth_token") ? response.getString("auth_token") : "";
                            auth newUser = new auth(auth_token);

                            Stash.put(Constants.AUTH_TOKEN, newUser);


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                        if (response.has("auth_token")){

                           /* Intent mint = new Intent(LoginActivity.this, MainActivity.class);
                            mint.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(mint);*/

                            /*Intent mint = new Intent(LoginActivity.this, offlineHome.class);
                            mint.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(mint);


                            Toast.makeText(LoginActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            if (pDialog != null && pDialog.isShowing()) {
                                pDialog.hide();
                                pDialog.cancel();
                            }

                            Toast.makeText(LoginActivity.this, "Please Try again later!", Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onError(ANError error) {
                        // handle error
                        Log.e(TAG, String.valueOf(error.getErrorCode()));

                        if (pDialog != null && pDialog.isShowing()) {
                            pDialog.hide();
                            pDialog.cancel();
                        }

                        if (error.getErrorBody() != null && error.getErrorBody().contains("Unable to log in with provided credentials.")){

                            Snackbar.make(findViewById(R.id.login_lyt), "Invalid phone number or password." , Snackbar.LENGTH_LONG).show();


                        }
                        else {

                            // Snackbar.make(findViewById(R.id.login_lyt), "Error: " + error.getErrorCode(), Snackbar.LENGTH_LONG).show();


                        }


                    }
                });*/
    }

    }
