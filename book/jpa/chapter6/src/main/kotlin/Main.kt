import entity.manyToMany.oneWay.Product
import entity.manyToMany.oneWay.Member
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val emf: EntityManagerFactory = Persistence.createEntityManagerFactory("jpabook")
    val em = emf.createEntityManager()
    val tx = em.transaction

    tx.begin()

    save(em)
    find(em)

    tx.commit()
    em.close()
    emf.close()
}

private fun save(em: EntityManager) {

    val productA = Product().apply {
        id = "productA"
        name = "상품A"
    }
    em.persist(productA)

    val member = Member().apply {
        id = "member1"
        username = "회원1"
        products.add(productA)
    }
    em.persist(member)
}

private fun find(em: EntityManager) {

    val member = em.find(Member::class.java, "member1")
    val products = member.products
    products.forEach {
        println("product.name = ${it.name}")
    }
}
