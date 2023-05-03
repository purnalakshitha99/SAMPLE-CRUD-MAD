package com.lahiru.crud.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lahiru.crud.R
import com.lahiru.crud.models.EmployeeModel

class EmpAdapter(private val empList: ArrayList<EmployeeModel>) :
    RecyclerView.Adapter<EmpAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.emp_list_item,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: EmpAdapter.ViewHolder, position: Int) {
        val currentEmp = empList[position]
        holder.tvEmpName.text = currentEmp.empName
    }

    override fun getItemCount(): Int {
        return empList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvEmpName : TextView = itemView.findViewById(R.id.tvEmpName)
    }
}