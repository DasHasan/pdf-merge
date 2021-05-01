package de.hasan

import org.apache.pdfbox.io.MemoryUsageSetting
import org.apache.pdfbox.multipdf.PDFMergerUtility
import java.io.File

fun main() {
    val path = File("").absoluteFile
    val name = path.name + ".pdf"
    val list = path.walk().maxDepth(1).filter { it.name.endsWith("pdf") }.toList()
    println(name)
    println(list)

    PDFMergerUtility().apply {
        destinationFileName = name
        addSources(list.map { it.inputStream() })
        mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly())
    }
}