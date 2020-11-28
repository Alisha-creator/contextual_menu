package alisha.digipodium.contextual_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         ImageView imgShare = findViewById(R.id.imgShare);
         registerForContextMenu(imgShare);
         ImageView imgShare1 = findViewById(R.id.imgShare1);
         registerForContextMenu(imgShare1);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.contextual_menu,menu);
        menu.setHeaderTitle("choose your option");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()){
            case R.id.op_1:
                Toast.makeText(this,"Share",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.op_2:
                Toast.makeText(this,"Edit",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.op_3:
                Toast.makeText(this,"Delete",Toast.LENGTH_SHORT).show();
                return  true;
        }
        return super.onContextItemSelected(item);
    }
}