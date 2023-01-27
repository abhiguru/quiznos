package `in`.tutorial.quiznos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvName:TextView? = findViewById(R.id.tv_name)
        val tvScore:TextView? = findViewById(R.id.tv_score)
        val btnFin:Button? = findViewById(R.id.btnFinish)
        tvName?.text = intent.getStringExtra(Constants.USER_NAME)
        val correct : Int = intent.getIntExtra(Constants.CORRECT_ANS, 0)
        val totalQ : Int = intent.getIntExtra(Constants.TOTAL_Q, 0)
        tvScore?.text = "You had $correct from $totalQ"
        btnFin?.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}