package id.me.qrcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageQR = findViewById<ImageView>(R.id.main_iv_qr)

        val mQRBitmap = QrUtility.generateQR("ini isi Kode QR nya.")
        if (mQRBitmap != null) {
            imageQR.setImageBitmap(mQRBitmap)
        } else {
            Toast.makeText(this, "Gagal membuat QR Code", Toast.LENGTH_SHORT).show()
        }
    }
}