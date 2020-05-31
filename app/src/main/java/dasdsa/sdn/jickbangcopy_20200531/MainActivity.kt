package dasdsa.sdn.jickbangcopy_20200531

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dasdsa.sdn.jickbangcopy_20200531.datas.Room

class MainActivity : BaseActivity() {

    val rooms = ArrayList<Room>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

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
    }

}
