/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.atlas.odf.core.messaging;

import java.util.concurrent.TimeoutException;

import org.apache.atlas.odf.api.discoveryservice.AnalysisRequestTracker;
import org.apache.atlas.odf.api.engine.MessagingStatus;
import org.apache.atlas.odf.core.controlcenter.AdminMessage;
import org.apache.atlas.odf.core.controlcenter.StatusQueueEntry;



public interface DiscoveryServiceQueueManager {
	
	void start() throws TimeoutException;
	
	void stop() throws TimeoutException;
		
	// find the next queue where this tracker should go and put it there
	void enqueue(AnalysisRequestTracker tracker);
	
	void enqueueInStatusQueue(StatusQueueEntry sqe);
	
	void enqueueInAdminQueue(AdminMessage message);
	
	MessagingStatus getMessagingStatus();
}
