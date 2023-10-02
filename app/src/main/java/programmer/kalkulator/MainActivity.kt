package programmer.kalkulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_switch : Button
    private lateinit var btn_move : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_switch = findViewById(R.id.btn_switch)
        btn_switch.setOnClickListener(this)
        btn_move = findViewById(R.id.btn_move)
        btn_move.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_switch->{
                val moveIn = Intent(this@MainActivity, MainIntentUp::class.java)
                startActivity(moveIn)
            }
            R.id.btn_move-> {
                val intentData = Intent (this@MainActivity, MoveWithDataActivity::class.java)
                intentData.putExtra(MoveWithDataActivity.EXTRA_NAME, "Fajriana Nabila")
                intentData.putExtra(MoveWithDataActivity.EXTRA_AGE,20)
                intentData.putExtra(MoveWithDataActivity.EXTRA_DEP, "TEKNIK ELEKTRONIKA")
                intentData.putExtra(MoveWithDataActivity.EXTRA_PRO, "PENDIDIKAN TEKNIK INFORMATIKA")
                startActivity(intentData)
            }
        }

        }
    }