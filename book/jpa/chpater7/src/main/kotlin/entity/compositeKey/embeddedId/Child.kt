package entity.compositeKey.embeddedId

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinColumns
import javax.persistence.ManyToOne

@Entity
open class Child {

    @Id
    open var id: String? = null

    @ManyToOne
    @JoinColumns(
        JoinColumn(name = "PARENT_ID1", referencedColumnName = "PARENT_ID1"),
        JoinColumn(name = "PARENT_ID2", referencedColumnName = "PARENT_ID2")
    )
    open var parent: Parent? = null
}