package ac.me.entity.kotlin

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
class Kotlin(
    @Id
    var id: Long = -1,
    var name: String = ""
)
