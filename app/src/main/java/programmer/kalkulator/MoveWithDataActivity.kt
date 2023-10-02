package programmer.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MoveWithDataActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DEP = "extra_dep"
        const val EXTRA_PRO = "extra_pro"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)
        val receiveData = findViewById<TextView>(R.id.dataReceive)

        //deklarasi variable untuk menampung data yang akan diberikan dari intent asal
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val dep = intent.getStringExtra(EXTRA_DEP)
        val pro = intent.getStringExtra(EXTRA_PRO)
        val text = "Name : $name, Your Age : $age , Departemen : $dep, Prodi : $pro"
        receiveData.text = text
    }
}