package rajat028.notificationbelldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import utils_notification.AnimatedIconView;
import utils_notification.NotificationAlert;

public class MainActivity extends AppCompatActivity {
    AnimatedIconView acvNotification;
    Button btnAnimate;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acvNotification = (AnimatedIconView) findViewById(R.id.acv_notification);
        btnAnimate = (Button) findViewById(R.id.btn_animate);
        acvNotification.setAnimatedIcon(new NotificationAlert());
        btnAnimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                acvNotification.setAnimatedIcon(new NotificationAlert().setNotificationCount(i));
                acvNotification.startAnimation();
            }
        });

    }
}
