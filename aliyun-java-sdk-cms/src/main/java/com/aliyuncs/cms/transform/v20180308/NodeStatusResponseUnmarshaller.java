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

package com.aliyuncs.cms.transform.v20180308;

import com.aliyuncs.cms.model.v20180308.NodeStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class NodeStatusResponseUnmarshaller {

	public static NodeStatusResponse unmarshall(NodeStatusResponse nodeStatusResponse, UnmarshallerContext context) {
		
		nodeStatusResponse.setRequestId(context.stringValue("NodeStatusResponse.RequestId"));
		nodeStatusResponse.setErrorCode(context.integerValue("NodeStatusResponse.ErrorCode"));
		nodeStatusResponse.setErrorMessage(context.stringValue("NodeStatusResponse.ErrorMessage"));
		nodeStatusResponse.setSuccess(context.booleanValue("NodeStatusResponse.Success"));
		nodeStatusResponse.setInstanceId(context.stringValue("NodeStatusResponse.InstanceId"));
		nodeStatusResponse.setAutoInstall(context.booleanValue("NodeStatusResponse.AutoInstall"));
		nodeStatusResponse.setStatus(context.stringValue("NodeStatusResponse.Status"));
	 
	 	return nodeStatusResponse;
	}
}