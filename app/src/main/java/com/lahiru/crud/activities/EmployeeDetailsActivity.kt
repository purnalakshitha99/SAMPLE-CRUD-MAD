package com.lahiru.crud.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.lahiru.crud.R

class EmployeeDetailsActivity : AppCompatActivity() {

    private lateinit var tvEmpId : TextView
    private lateinit var tvEmpName : TextView
    private lateinit var tvEmpAge : TextView
    private lateinit var tvEmpSalary : TextView
    private lateinit var btnUpdate : Button
    private lateinit var btnDelete : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_details)

      initView()
        setValuesToViews()
    }

    private fun initView(){

        tvEmpId = findViewById(R.id.tvEmpId)
        tvEmpName = findViewById(R.id.tvEmpName)
        tvEmpAge = findViewById(R.id.tvEmpAge)
        tvEmpSalary = findViewById(R.id.tvEmpSalary)


        btnDelete = findViewById(R.id.btnDelete)
        btnUpdate = findViewById(R.id.btnDelete)

    }

    private fun setValuesToViews() {
        tvEmpId.text = intent.getStringExtra("empId")
        tvEmpName.text = intent.getStringExtra("empName")
        tvEmpAge.text = intent.getStringExtra("empAge")
        tvEmpSalary.text = intent.getStringExtra("empSalary")
    }
}