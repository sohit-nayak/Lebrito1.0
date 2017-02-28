package com.example.android.lebrito10;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by PRAVIN on 2/28/2017.
 */
public class RegisterRequest extends StringRequest {
    public static final String REGISTERREQUESTURL ="http://lebrito.herobo.com/Register.php";
    private Map<String,String> params;

    public RegisterRequest(String name,String emailId,String password, Response.Listener<String> listener) {
        super(Method.POST, REGISTERREQUESTURL, listener, null);
        params=new HashMap<>();
        params.put("name",name);
        params.put("emailId",emailId);
        params.put("password",password);
    }
    @Override
    public Map<String,String> getParams()
    {
        return params;
    }
}
