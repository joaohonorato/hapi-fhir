package ca.uhn.fhir.jpa.subscription;

/*-
 * #%L
 * HAPI FHIR JPA Server
 * %%
 * Copyright (C) 2014 - 2019 University Health Network
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class ResourceDeliveryJsonMessage extends BaseJsonMessage<ResourceDeliveryMessage> {

	@JsonProperty("payload")
	private ResourceDeliveryMessage myPayload;

	/**
	 * Constructor
	 */
	public ResourceDeliveryJsonMessage() {
		super();
	}

	/**
	 * Constructor
	 */
	public ResourceDeliveryJsonMessage(ResourceDeliveryMessage thePayload) {
		myPayload = thePayload;
	}

	@Override
	public ResourceDeliveryMessage getPayload() {
		return myPayload;
	}

	public void setPayload(ResourceDeliveryMessage thePayload) {
		myPayload = thePayload;
	}

}
