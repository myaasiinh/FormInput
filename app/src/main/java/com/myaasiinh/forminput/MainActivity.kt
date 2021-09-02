package com.myaasiinh.forminput

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var inputNama : TextInputEditText
    private lateinit var inputNamaPanggilan : TextInputEditText
    private lateinit var inputUmur : TextInputEditText
    private lateinit var inputJeniskelamin : TextInputEditText
    private lateinit var inputAsalsekolah : TextInputEditText
    private lateinit var simpan_button : Button
    private lateinit var hasilNama : TextView
    private lateinit var hasilNamaPanggilan : TextView
    private lateinit var hasilUmur : TextView
    private lateinit var hasilJeniskelamin : TextView
    private lateinit var hasilAsalsekolah : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         inputNama = findViewById(R.id.input_nama)
         inputNamaPanggilan = findViewById(R.id.input_nama_panggilan)
         inputUmur = findViewById(R.id.input_umur)
         inputJeniskelamin = findViewById(R.id.input_jenis_kelamin)
         inputAsalsekolah = findViewById(R.id.input_asal_sekolah)
         simpan_button = findViewById(R.id.simpan_button)
         hasilNama = findViewById(R.id.hasil_nama)
         hasilNamaPanggilan = findViewById(R.id.hasil_nama_panggilan)
         hasilUmur = findViewById(R.id.hasil_umur)
         hasilJeniskelamin = findViewById(R.id.hasil_jenis_kelamin)
         hasilAsalsekolah  = findViewById(R.id.hasil_asal_sekolah)

        simpan_button. setOnClickListener {

            val nama = inputNama.text.toString()
            hasilNama.text = nama
            val namapanggilan = inputNamaPanggilan.text.toString()
            hasilNamaPanggilan.text = namapanggilan
            val umur = inputUmur.text.toString()
            hasilUmur.text = umur
            val jeniskelamin = inputJeniskelamin.text.toString()
            hasilJeniskelamin.text = jeniskelamin
            val institusi = inputAsalsekolah.text.toString()
            hasilAsalsekolah.text = institusi
        }

    }

}