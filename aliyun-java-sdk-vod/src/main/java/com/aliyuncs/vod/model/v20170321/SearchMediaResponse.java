/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.SearchMediaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchMediaResponse extends AcsResponse {

	private String requestId;

	private String scrollToken;

	private Long total;

	private List<Media> mediaList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getScrollToken() {
		return this.scrollToken;
	}

	public void setScrollToken(String scrollToken) {
		this.scrollToken = scrollToken;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<Media> getMediaList() {
		return this.mediaList;
	}

	public void setMediaList(List<Media> mediaList) {
		this.mediaList = mediaList;
	}

	public static class Media {

		private String mediaType;

		private String creationTime;

		private String mediaId;

		private Video video;

		private Audio audio;

		private Image image;

		public String getMediaType() {
			return this.mediaType;
		}

		public void setMediaType(String mediaType) {
			this.mediaType = mediaType;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public Video getVideo() {
			return this.video;
		}

		public void setVideo(Video video) {
			this.video = video;
		}

		public Audio getAudio() {
			return this.audio;
		}

		public void setAudio(Audio audio) {
			this.audio = audio;
		}

		public Image getImage() {
			return this.image;
		}

		public void setImage(Image image) {
			this.image = image;
		}

		public static class Video {

			private String videoId;

			private String mediaSource;

			private String mediaType;

			private String title;

			private String tags;

			private String status;

			private Long size;

			private Float duration;

			private String description;

			private String modificationTime;

			private String creationTime;

			private String coverURL;

			private Long cateId;

			private String cateName;

			private String downloadSwitch;

			private String preprocessStatus;

			private String storageLocation;

			private String regionId;

			private String transcodeMode;

			private List<String> snapshots;

			private List<String> spriteSnapshots;

			public String getVideoId() {
				return this.videoId;
			}

			public void setVideoId(String videoId) {
				this.videoId = videoId;
			}

			public String getMediaSource() {
				return this.mediaSource;
			}

			public void setMediaSource(String mediaSource) {
				this.mediaSource = mediaSource;
			}

			public String getMediaType() {
				return this.mediaType;
			}

			public void setMediaType(String mediaType) {
				this.mediaType = mediaType;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public Float getDuration() {
				return this.duration;
			}

			public void setDuration(Float duration) {
				this.duration = duration;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getModificationTime() {
				return this.modificationTime;
			}

			public void setModificationTime(String modificationTime) {
				this.modificationTime = modificationTime;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getCoverURL() {
				return this.coverURL;
			}

			public void setCoverURL(String coverURL) {
				this.coverURL = coverURL;
			}

			public Long getCateId() {
				return this.cateId;
			}

			public void setCateId(Long cateId) {
				this.cateId = cateId;
			}

			public String getCateName() {
				return this.cateName;
			}

			public void setCateName(String cateName) {
				this.cateName = cateName;
			}

			public String getDownloadSwitch() {
				return this.downloadSwitch;
			}

			public void setDownloadSwitch(String downloadSwitch) {
				this.downloadSwitch = downloadSwitch;
			}

			public String getPreprocessStatus() {
				return this.preprocessStatus;
			}

			public void setPreprocessStatus(String preprocessStatus) {
				this.preprocessStatus = preprocessStatus;
			}

			public String getStorageLocation() {
				return this.storageLocation;
			}

			public void setStorageLocation(String storageLocation) {
				this.storageLocation = storageLocation;
			}

			public String getBizRegionId() {
				return this.regionId;
			}

			public void setBizRegionId(String regionId) {
				this.regionId = regionId;
			}

			/**
			 * @deprecated use getBizRegionId instead of this.
			 */
			@Deprecated
			public String getRegionId() {
				return this.regionId;
			}

			/**
			 * @deprecated use setBizRegionId instead of this.
			 */
			@Deprecated
			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getTranscodeMode() {
				return this.transcodeMode;
			}

			public void setTranscodeMode(String transcodeMode) {
				this.transcodeMode = transcodeMode;
			}

			public List<String> getSnapshots() {
				return this.snapshots;
			}

			public void setSnapshots(List<String> snapshots) {
				this.snapshots = snapshots;
			}

			public List<String> getSpriteSnapshots() {
				return this.spriteSnapshots;
			}

			public void setSpriteSnapshots(List<String> spriteSnapshots) {
				this.spriteSnapshots = spriteSnapshots;
			}
		}

		public static class Audio {

			private String audioId;

			private String mediaSource;

			private String title;

			private String tags;

			private String status;

			private Long size;

			private Float duration;

			private String description;

			private String modificationTime;

			private String creationTime;

			private String coverURL;

			private Long cateId;

			private String cateName;

			private String downloadSwitch;

			private String preprocessStatus;

			private String storageLocation;

			private String regionId;

			private String transcodeMode;

			private List<String> snapshots1;

			private List<String> spriteSnapshots2;

			public String getAudioId() {
				return this.audioId;
			}

			public void setAudioId(String audioId) {
				this.audioId = audioId;
			}

			public String getMediaSource() {
				return this.mediaSource;
			}

			public void setMediaSource(String mediaSource) {
				this.mediaSource = mediaSource;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public Float getDuration() {
				return this.duration;
			}

			public void setDuration(Float duration) {
				this.duration = duration;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getModificationTime() {
				return this.modificationTime;
			}

			public void setModificationTime(String modificationTime) {
				this.modificationTime = modificationTime;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getCoverURL() {
				return this.coverURL;
			}

			public void setCoverURL(String coverURL) {
				this.coverURL = coverURL;
			}

			public Long getCateId() {
				return this.cateId;
			}

			public void setCateId(Long cateId) {
				this.cateId = cateId;
			}

			public String getCateName() {
				return this.cateName;
			}

			public void setCateName(String cateName) {
				this.cateName = cateName;
			}

			public String getDownloadSwitch() {
				return this.downloadSwitch;
			}

			public void setDownloadSwitch(String downloadSwitch) {
				this.downloadSwitch = downloadSwitch;
			}

			public String getPreprocessStatus() {
				return this.preprocessStatus;
			}

			public void setPreprocessStatus(String preprocessStatus) {
				this.preprocessStatus = preprocessStatus;
			}

			public String getStorageLocation() {
				return this.storageLocation;
			}

			public void setStorageLocation(String storageLocation) {
				this.storageLocation = storageLocation;
			}

			public String getBizRegionId() {
				return this.regionId;
			}

			public void setBizRegionId(String regionId) {
				this.regionId = regionId;
			}

			/**
			 * @deprecated use getBizRegionId instead of this.
			 */
			@Deprecated
			public String getRegionId() {
				return this.regionId;
			}

			/**
			 * @deprecated use setBizRegionId instead of this.
			 */
			@Deprecated
			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getTranscodeMode() {
				return this.transcodeMode;
			}

			public void setTranscodeMode(String transcodeMode) {
				this.transcodeMode = transcodeMode;
			}

			public List<String> getSnapshots1() {
				return this.snapshots1;
			}

			public void setSnapshots1(List<String> snapshots1) {
				this.snapshots1 = snapshots1;
			}

			public List<String> getSpriteSnapshots2() {
				return this.spriteSnapshots2;
			}

			public void setSpriteSnapshots2(List<String> spriteSnapshots2) {
				this.spriteSnapshots2 = spriteSnapshots2;
			}
		}

		public static class Image {

			private String title;

			private String imageId;

			private Long cateId;

			private String cateName;

			private String ext;

			private String creationTime;

			private String modificationTime;

			private String tags;

			private String type;

			private String uRL;

			private String status;

			private String description;

			private String storageLocation;

			private String regionId;

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public Long getCateId() {
				return this.cateId;
			}

			public void setCateId(Long cateId) {
				this.cateId = cateId;
			}

			public String getCateName() {
				return this.cateName;
			}

			public void setCateName(String cateName) {
				this.cateName = cateName;
			}

			public String getExt() {
				return this.ext;
			}

			public void setExt(String ext) {
				this.ext = ext;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getModificationTime() {
				return this.modificationTime;
			}

			public void setModificationTime(String modificationTime) {
				this.modificationTime = modificationTime;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getURL() {
				return this.uRL;
			}

			public void setURL(String uRL) {
				this.uRL = uRL;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getStorageLocation() {
				return this.storageLocation;
			}

			public void setStorageLocation(String storageLocation) {
				this.storageLocation = storageLocation;
			}

			public String getBizRegionId() {
				return this.regionId;
			}

			public void setBizRegionId(String regionId) {
				this.regionId = regionId;
			}

			/**
			 * @deprecated use getBizRegionId instead of this.
			 */
			@Deprecated
			public String getRegionId() {
				return this.regionId;
			}

			/**
			 * @deprecated use setBizRegionId instead of this.
			 */
			@Deprecated
			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}
	}

	@Override
	public SearchMediaResponse getInstance(UnmarshallerContext context) {
		return	SearchMediaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
