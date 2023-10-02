package programmer.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var input_panjang : EditText
    private lateinit var input_lebar : EditText
    private lateinit var input_tinggi: EditText
    private lateinit var teks_hasil: TextView
    private lateinit var btn: Button

    companion object {
        private const val STATE_RESULT = "state_result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //inisialisasi variable
        input_panjang = findViewById(R.id.edt_length)
        input_lebar = findViewById(R.id.edt_width)
        input_tinggi = findViewById(R.id.edt_height)
        btn = findViewById(R.id.btn_result)
        teks_hasil = findViewById(R.id.result)
       if (savedInstanceState != null) {
           teks_hasil.text = savedInstanceState.getString(STATE_RESULT)
       }
        btn.setOnClickListener(this)


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, teks_hasil.text.toString())
    }

    override fun onClick(v: View?) {
        if (v?.id== R.id.btn_result){
            val input_panjang = input_panjang.text.toString().trim()
            val input_lebar = input_lebar.text.toString().trim()
            val input_tinggi = input_tinggi.text.toString().trim()
            val volume = input_panjang.toDouble() * input_lebar.toDouble() * input_tinggi.toDouble()
            teks_hasil.text = volume.toString()
        }
    }
}