package info.makanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> gambarMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> deskripsiMakanan = new ArrayList<>();
    private  ArrayList<String> hargamakanan = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDataGoogle();


    }
    private void prosesRecycleAdapter(){
        RecyclerView recyclerView = findViewById(R.id.rec_menu);
        RecyclerViewAdapter adapterview = new RecyclerViewAdapter(gambarMakanan,namaMakanan,deskripsiMakanan,hargamakanan,this);
        recyclerView.setAdapter(adapterview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    void getDataGoogle(){
        gambarMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/kimchi.jpg");
        namaMakanan.add("Kimchi");
        deskripsiMakanan.add(" sayuran yang difermentasi dengan bumbu khas sehingga menghasilkan rasa yang pedas dan asam.");
        hargamakanan.add("Rp25.000");

        gambarMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/sannakji.jpg");
        namaMakanan.add("Sannakji");
        deskripsiMakanan.add("Sannakji adalah makanan yang berasal dari gurita hidup yang dimakan dengan minyak atau biji wijen.");
        hargamakanan.add("Rp50.000");

        gambarMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/jjajangmyeon.jpg");
        namaMakanan.add("Jjajangmyeon");
        deskripsiMakanan.add("mie dengan saus kedelai hitam");
        hargamakanan.add("Rp100.000");

        gambarMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/kimbab.jpg");
        namaMakanan.add("Kimbbab");
        deskripsiMakanan.add("Nasi yang digulung dengan gim atau rumput laut kering yang di dalamnya berisi sayuran seperti wortel, bayam, timun, kemudian telur dan daging");
        hargamakanan.add("Rp60.000");

       gambarMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/bibimbap.jpg");
        namaMakanan.add("Bibimbap");
        deskripsiMakanan.add("nasi yang dicampur dan diaduk dengan berbagai macam lauk pauk yang ada di atasnya.Ada 7 macam jenis sayuran yang ada dalam bibimbab yang kemudian dicampur dengan daging dan telur atau tahu.");
        hargamakanan.add("Rp70.000");

        gambarMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/bulgogi.jpg");
        namaMakanan.add("Bulgogi");
        deskripsiMakanan.add("mie instan dari Korea dan cenderung memiliki tekstur yang lebih tebal dan bumbunya saat dicampurkan dengan air mendidih akan terasa lebih kental.");
        hargamakanan.add("Rp20.000");

        gambarMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/ramyeon.jpg");
        namaMakanan.add("Ramyeon");
        deskripsiMakanan.add("Berisikan Kuah Soto dan Nasi");
        hargamakanan.add("Rp80.000");

        gambarMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/tteokbokki.jpg");
        namaMakanan.add("Tteokbokki");
        deskripsiMakanan.add("kue beras atau tteok yang kemudian dicampur dengan saus khas Korea dan terkadang ada yang mencampurnya dalam ramyeon atau pun dicampur dengan sosis dan daging. Makanan ini rasanya pedas dan manis. ");
        hargamakanan.add("Rp50.000");

        prosesRecycleAdapter();
    }
}