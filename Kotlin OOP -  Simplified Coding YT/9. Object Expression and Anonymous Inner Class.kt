/*class App: DownloadListener {
    override fun onDownloadStarted() {
        println("Download Started...")
    }

    override fun onDownloadCompleted(file: String) {
        println("$file Downloaded.")
    }

    override fun onProgressUpdate(progress: Int) {
        println("$progress% Downloaded")
    }
}*/

fun main() {
    /*val objectApp: App =  App()
    val objectDownloader: Downloader = Downloader()

    objectDownloader.downloadListener = objectApp
    objectDownloader.downloadFile("FileA.mkv")*/

    // Bujhci but still has confusion I guess!

    // We can simplyfy this by using object expressions or anonymous inner classes
    // Instead of creating class we can pass object expression

    val objectDownloader: Downloader = Downloader()

    // Object Expression / Anonymous Inner Class
    objectDownloader.downloadListener = object : DownloadListener {
        override fun onDownloadStarted() {
            println("Download Started...")
        }

        override fun onDownloadCompleted(file: String) {
            println("$file Downloaded.")
        }

        override fun onProgressUpdate(progress: Int) {
            println("$progress% Downloaded")
        }
    }
    objectDownloader.downloadFile("FileA.mkv")
}

interface DownloadListener {
    fun onDownloadStarted() // calls each time value not null

    fun onDownloadCompleted(file: String) // after loop ended

    fun onProgressUpdate(progress: Int) // give updates by showing percentages: 10, 20, 30, ...
}

class Downloader {
    var downloadListener: DownloadListener? = null

    fun downloadFile(file: String) {
        downloadListener?.onDownloadStarted() // when not null it calls

        // fake the file download
        for(i in 1..10) {
            Thread.sleep(500)
            downloadListener?.onProgressUpdate(i * 10)
        }
        downloadListener?.onDownloadCompleted(file)
    }
}
