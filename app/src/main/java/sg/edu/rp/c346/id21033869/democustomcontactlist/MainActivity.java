package sg.edu.rp.c346.id21033869.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvContact;
        ArrayList<Contact> alContactList;
        CustomAdapter caContact;
        ImageView iv;

        iv = findViewById(R.id.iv);
        lvContact = findViewById(R.id.listViewContacts);
        alContactList = new ArrayList<>();
        Contact item1 = new Contact("Mary", 65, 65442334, 'F');
        alContactList.add(item1);

        Contact item2 = new Contact("Ken", 65, 97442437, 'M');
        alContactList.add(item2);


        caContact = new CustomAdapter(this, R.layout.row, alContactList);
        lvContact.setAdapter(caContact);

        String imageUrl = "https://i.imgur.com/tGbaZCY.jpg";
        Picasso.with(this).load(imageUrl).into(iv);

    }

}