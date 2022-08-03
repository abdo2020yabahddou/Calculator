package www.abdel.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var isNewOp =true
    fun buNumberEvent(view: View){
        if(isNewOp){
            textShowNumber.text=" "
        }
        isNewOp = false
        var textNumber :String= textShowNumber.text.toString()
        val buSelect = view as Button

        when(buSelect.id){
            bu0.id -> {
            textNumber +="0"
        }
            bu1.id -> {
                textNumber +="1"
            }
            bu2.id -> {
                textNumber +="2"
            }
            bu3.id -> {
                textNumber +="3"
            }
            bu4.id -> {
                textNumber +="4"
            }
            bu5.id -> {
                textNumber +="5"
            }
            bu6.id -> {
                textNumber +="6"
            }
            bu7.id -> {
                textNumber +="7"
            }
            bu8.id -> {
                textNumber +="8"
            }
            bu9.id -> {
                textNumber +="9"
        }
            buPoint.id -> {
                textNumber +="."
            }

           buPlus.id -> {
               textNumber +="-" + textNumber
        }
        }
       textShowNumber.text =textNumber
    }
    var oldNumber = ""
    var op = "+"
    fun buOpEvent(view: View){
        oldNumber = textShowNumber.text.toString()
        isNewOp=true
        val buSelect = view as Button
        when(buSelect.id){
            buDiv.id -> {
                op = "/a"
            }
            buMul.id -> {
                op = "*"
            }
            buSub.id -> {
                op = "-"
            }
            buPlus2.id -> {
                op = "+"
            }
//            buPlus.id -> {
//                op = "+/-"
//            }
        }
    }
    fun buEqualEvent(view: View){
        val newNumber = textShowNumber.text.toString()
        var finalNumber:Double?=null
        when(op){
            "/"->{
                finalNumber=oldNumber.toDouble() / newNumber.toDouble()
            }
            "+"->{
                finalNumber=oldNumber.toDouble()+newNumber.toDouble()
            }
            "-"->{
                finalNumber=oldNumber.toDouble()-newNumber.toDouble()
            }
            "*"->{
                finalNumber=oldNumber.toDouble()*newNumber.toDouble()
            }
//            "+/-" ->{
//                finalNumber=oldNumber.toDouble()-newNumber.toDouble()
//            }

        }
        textShowNumber.text= finalNumber.toString()
        isNewOp=true
    }
    fun buClear(view: View){
        isNewOp =true
        textShowNumber.text="0"
    }
}


