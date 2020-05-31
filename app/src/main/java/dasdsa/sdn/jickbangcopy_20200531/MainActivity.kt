package dasdsa.sdn.jickbangcopy_20200531

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import dasdsa.sdn.jickbangcopy_20200531.adapters.RoomAdapter
import dasdsa.sdn.jickbangcopy_20200531.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var roomAdapter : RoomAdapter
    val rooms = ArrayList<Room>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        roomListView.setOnItemLongClickListener { parent, view, position, id ->

            val alert = AlertDialog.Builder(mContext)
            alert.setTitle("테스트")
            alert.setMessage("테스트용 얼럿")
            alert.setPositiveButton("확인", null)
            alert.show()

            return@setOnItemLongClickListener true

        }

    }

    override fun setValues() {
        rooms.add(Room(8000, "마포구 서교동", 1, "마포구 서교동의 방입니다."))
        rooms.add(Room(28000, "마포구 서교동", 3, "마포구 서교동의 방입니다."))
        rooms.add(Room(12000, "마포구 선상동", 1, "마포구 선상동의 방입니다."))
        rooms.add(Room(7000, "마포구 서교동", 0, "마포구 서교동의 방입니다."))
        rooms.add(Room(6000, "마포구 선상동", 2, "마포구 선상동의 방입니다."))
        rooms.add(Room(3000, "마포구 선상동", 0, "마포구 선상동의 방입니다."))
        rooms.add(Room(9000, "마포구 서교동", 7, "마포구 서교동의 방입니다."))
        rooms.add(Room(13000, "마포구 선상동", -1, "마포구 선상동의 방입니다."))
        rooms.add(Room(24000, "마포구 망원동", 2, "마포구 망원동의 방입니다."))
        rooms.add(Room(20000, "마포구 망원동", 3, "마포구 망원동의 방입니다."))

        roomAdapter = RoomAdapter(mContext, R.layout.room_list_item, rooms)

        roomListView.adapter = roomAdapter


    }

}
