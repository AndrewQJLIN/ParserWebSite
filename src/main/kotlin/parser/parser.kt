import org.jsoup.Jsoup

fun main() {

    val doc = Jsoup.connect(urlBook).get()

    println(doc.title())

    val notes = doc.getElementsByClass(className)
    for ((index, note) in notes.withIndex()) {
        println("${index + 1}. - ${note.text()}")
    }
}

const val urlBook =
    "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
const val className = "sc-2aegk7-2"