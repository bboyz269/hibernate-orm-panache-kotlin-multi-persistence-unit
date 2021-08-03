package ac.me.entity.java

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
class Java(
    @Id
    var id: Long = -1,
    var name: String = ""
)
