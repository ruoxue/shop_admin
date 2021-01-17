import com.github.kiulian.downloader.YoutubeDownloader;
import com.github.kiulian.downloader.YoutubeException;
import com.github.kiulian.downloader.model.VideoDetails;
import com.github.kiulian.downloader.model.YoutubeVideo;

import java.io.File;

public class Down {


    public static void main(String[] args) throws  Exception {
        // init downloader
        YoutubeDownloader downloader = new YoutubeDownloader();

// you can easly implement or extend default parsing logic
//        YoutubeDownloader downloader = new YoutubeDownloader(new Parser());
// downloader configurations
        downloader.setParserRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36");
        downloader.setParserRetryOnFailure(1);

// parsing data
        String videoId = "0yhXDBiDaHg"; // for url https://www.youtube.com/watch?v=abc12345
        YoutubeVideo video = downloader.getVideo(videoId);
        System.out.println(System.getProperty("user.dir"));
        video.download(video.formats().get(0),
                new File(System.getProperty("user.dir")+File.separator+"down"));




// video details
        VideoDetails details = video.details();
        System.out.println(details.title());
    }
}
