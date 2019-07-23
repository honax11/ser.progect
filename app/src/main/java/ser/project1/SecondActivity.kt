package ser.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        bottomNav.selectedItemId = R.id.bot2
        bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.bot1 -> onBot1Clicked()
                R.id.bot2 -> onBot2Clicked()
                // R.id.bot3 -> onBot3Clicked()
                //R.id.bot4 -> onBot4Clicked()

            }
            true
        }
    }

    private fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun onBot1Clicked() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    private fun onBot2Clicked() {
        showMessage("bot2")

    }
}
