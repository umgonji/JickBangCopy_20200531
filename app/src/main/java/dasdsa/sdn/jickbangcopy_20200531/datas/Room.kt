package dasdsa.sdn.jickbangcopy_20200531.datas

import java.text.NumberFormat
import java.util.*

class Room(val price:Int, val address:String, val floor: Int, val description:String) {

    fun getFormattedFloor() : String {

        if(this.floor > 0) {
            return "${this.floor}층"
        }
        else if (this.floor == 0) {
            return "반지하"
        }
        else {
            return "지하 ${-this.floor}층"
        }
    }

    fun getFormattedPrice() : String {
        /*
        if(this.price >= 10000) {
            return "${this.price/10000}억${this.price%10000/1000},000"
        }
        else if(this.price >= 1000) {
            return "${this.price/1000},000"
        }
        else {
            return "${this.price}"
        }
        */
        if(this.price < 10000) {
            return NumberFormat.getInstance(Locale.KOREA).format(this.price)
        }
        else {
            val uk = this.price / 10000
            val underUk = this.price % 10000
            return "${uk}억 ${NumberFormat.getInstance(Locale.KOREA).format(underUk)}"
        }
    }
}