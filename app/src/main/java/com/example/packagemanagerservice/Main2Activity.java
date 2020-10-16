package com.example.packagemanagerservice;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.packagemanagerservice.permission.Permission;
import com.example.packagemanagerservice.permission.PermissionCancel;
import com.example.packagemanagerservice.permission.PermissionDenied;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void test(View view) {}

    // 点击事件
    public void permissionRequestTest(View view) {
        testRequest();
    }

    // 申请权限  函数名可以随意些
    @Permission(value = Manifest.permission.READ_CONTACTS, requestCode = 200)
    public void testRequest() {
        Toast.makeText(this, "权限申请成功...", Toast.LENGTH_SHORT).show();
        // 100 行
    }

    // 权限被取消  函数名可以随意些
    @PermissionCancel
    public void testCancel() {
        Toast.makeText(this, "权限被拒绝", Toast.LENGTH_SHORT).show();
    }

    // 多次拒绝，还勾选了“不再提示”
    @PermissionDenied
    public void testDenied() {
        Toast.makeText(this, "权限被拒绝(用户勾选了 不再提示)，注意：你必须要去设置中打开此权限，否则功能无法使用", Toast.LENGTH_SHORT).show();
    }
}
