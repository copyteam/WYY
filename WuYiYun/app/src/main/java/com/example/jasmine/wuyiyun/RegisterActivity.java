package com.example.jasmine.wuyiyun;

import android.view.View;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
public class RegisterActivity extends Activity{

    public void regist(View view){
        User user = new User();
        user.setEmail(etLoginname.getText().toString());
        user.setPassword(etPwd.getText().toString());
        user.setNickname(etRealname.getText().toString());
        String code = etCode.getText().toString();
        presenter.regist(user, code);
    }
    public void back(View view) {
        finish();
    }
}
