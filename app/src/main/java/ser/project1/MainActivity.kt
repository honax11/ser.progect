package ser.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.bot1 -> onBot1Clicked()
                R.id.bot2 -> onBot2Clicked()
                R.id.bot3 -> onBot3Clicked()
                R.id.bot4 -> onBot4Clicked()

            }
            true
        }
    }

    private fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun onBot1Clicked() {
        showMessage("bot2")
    }

    private fun onBot2Clicked() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    private fun onBot3Clicked() {
        showMessage("bot3")
    }

    private fun onBot4Clicked() {
        showMessage("bot4")
    }

}
