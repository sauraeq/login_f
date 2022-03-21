package com.geelong.fblogin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.facebook.*
import com.facebook.CallbackManager.Factory.create
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.facebook.login.widget.LoginButton
import org.json.JSONException
import org.json.JSONObject
import java.util.*
import javax.security.auth.callback.Callback


private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    private lateinit var callbackManager: CallbackManager
    private lateinit var loginButton: LoginButton


    lateinit var bin:TextView

    private val mButtonFacebook: Button? = null

    private var loginManager: LoginManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        loginButton = findViewById(R.id.login_button)


        loginButton.setOnClickListener {
            intent = Intent(this, FAcebook::class.java)
            startActivity(intent)
        }
        /* callbackManager = CallbackManager.Factory.create()
        loginButton.setPermissions(listOf("email", "user_birthday"))

        //login callback
        loginButton.registerCallback(callbackManager, object : FacebookCallback<LoginResult> {

            public abstract fun onSuccess(loginResult: LoginResult?) {
                val userId = loginResult?.accessToken?.userId
                Log.d(TAG, "onSuccess: userId $userId")

                val bundle = Bundle()
                bundle.putString("fields", "id, email, first_name, last_name, gender,age_range")


                //Graph API to access the data of user's facebook account
                val request = GraphRequest.newMeRequest(
                    loginResult?.accessToken
                ) { fbObject, response ->
                    Log.v("Login Success", response.toString())


                    //For safety measure enclose the request with try and catch
                    try {

                        Log.d(TAG, "onSuccess: fbObject $fbObject")

                        val firstName = fbObject.getString("first_name")
                        val lastName = fbObject.getString("last_name")
                        val gender = fbObject.getString("gender")
                        val email = fbObject.getString("email")

                        Log.d(TAG, "onSuccess: firstName $firstName")
                        Log.d(TAG, "onSuccess: lastName $lastName")
                        Log.d(TAG, "onSuccess: gender $gender")
                        Log.d(TAG, "onSuccess: email $email")

                    } //If no data has been retrieve throw some error
                    catch (e: JSONException) {

                    }

                }
                //Set the bundle's data as Graph's object data
                request.setParameters(bundle)

                //Execute this Graph request asynchronously
                request.executeAsync()

            }

            override fun onCancel() {
                Log.d(TAG, "onCancel: called")
            }

            override fun onError(error: FacebookException?) {
                Log.d(TAG, "onError: called")
            }
        })
    }



    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        callbackManager.onActivityResult(requestCode, resultCode, data)
        super.onActivityResult(requestCode, resultCode, data)

    }*/

    }

}