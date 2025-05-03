// use an integer for version numbers
version = 1

android {
    namespace = "com.redowan"
}

cloudstream {
    description = "BDIX Live Tv in Bangladesh"
    authors = listOf("Redowan")

    /**
    * Status int as the following:
    * 0: Down
    * 1: Ok
    * 2: Slow
    * 3: Beta only
    * */
    status = 2 // will be 3 if unspecified

    tvTypes = listOf(
        "Live"
    )
    language = "bn"

    iconUrl = "https://roarzone.info/logo.webp"
}
