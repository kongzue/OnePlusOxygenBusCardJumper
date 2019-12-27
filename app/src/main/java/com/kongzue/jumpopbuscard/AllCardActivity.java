package com.kongzue.jumpopbuscard;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

public class AllCardActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_card);
        if (!openApp()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("提示");
            builder.setMessage("未安装“一加公交卡”");
            builder.setPositiveButton("立即下载", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    if (!goMarket("cn.oneplus.wallet")) {
                        Toast.makeText(AllCardActivity.this, "未找到可用的应用商店", Toast.LENGTH_SHORT).show();
                        finish();
                    }else{
                        finish();
                    }
                }
            });
            builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.show();
        } else {
            finish();
        }
    }
    
    public boolean goMarket(String appPkg) {
        try {
            if (TextUtils.isEmpty(appPkg)) return false;
            Uri uri = Uri.parse("market://details?id=" + appPkg);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean openApp() {
        try {
            Intent intent = new Intent();
            intent.setAction("cn.oneplus.wallet.action.LOCAL_CARDS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setPackage("cn.oneplus.wallet");
            startActivity(intent);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
