from youtube_transcript_api import YouTubeTranscriptApi

def B(subtitle):
        transcript=YouTubeTranscriptApi.get_transcript(f"{subtitle}" , languages=['ko','ko'])
        transcript_list = YouTubeTranscriptApi.list_transcripts("tsWUzue9rvI")


        subtitle = ""
        for i in transcript:
            subtitle += i['text']

        return subtitle
    
print(B('oqtCN3m6E8k'))