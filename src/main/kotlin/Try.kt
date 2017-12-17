import me.lazmaid.kraph.Kraph

fun main(args: Array<String>) {
    val query = Kraph {
        query {
            fieldObject("viewer") {
                field("name")
                fieldObject("repositories", mapOf("last" to 3)) {
                    fieldObject("nodes") {
                        field("name")
                    }
                }
            }
        }
    }
    println(query.toGraphQueryString())
}