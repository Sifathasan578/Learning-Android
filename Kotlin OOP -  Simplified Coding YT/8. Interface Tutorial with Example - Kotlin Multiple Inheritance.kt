fun main() {
    // reference of parent, but obj of child. as child extends parent we can do that
//    val audioDownloader: Downloader = Audio("Audio1.mp3")
    val audioDownloader = Audio("Audio1.mp3")
    val videoDownloader = Video("Video1.mkv")

    audioDownloader.download()
    audioDownloader.play() // can not: cause it is not inside downloader, can when data type is Any
    audioDownloader.playerInfo()
    videoDownloader.download()

    videoDownloader.download()
    videoDownloader.play()
    videoDownloader.playerInfo()
    videoDownloader.downloaderInfo()
}

class Video (private val name: String) : Downloader, Player {
    override fun download() {
        println("Downloading Video $name")
    }

    override fun play() {
        println("Playing Video $name")
    }
}

class Audio (private val name: String) : Downloader, Player {
    override fun download() {
        println("Downloading Audio $name")
    }

    override fun play() {
        println("Playing Audio $name")
    }
}

interface Downloader {
    /*init {
        println("Downloader Initiated")
    }*/

    fun downloaderInfo() {
        println("Downloader V1")
    }

    fun download()
}

interface Player {
    /*init {
        println("Player Initiated")
    }*/

    fun playerInfo() {
        println("Player V1")
    }

    fun play ()
}
