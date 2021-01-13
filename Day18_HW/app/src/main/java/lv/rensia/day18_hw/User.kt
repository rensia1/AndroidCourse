package lv.rensia.day18_hw

class User(var name: String, var surname: String, var username: String, var email: String, var city: String) {
    override fun toString(): String {
        return "name='$name', surname='$surname', username='$username', email='$email', city='$city'"
    }
}