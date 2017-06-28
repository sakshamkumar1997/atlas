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
package odftutorial.discoveryservicetutorial;

import org.apache.atlas.odf.core.metadata.Annotation;

/*
 * An example annotation that adds one property to the default annotation class
 */
public class ODFTutorialAnnotation extends Annotation {

	private String tutorialProperty;

	public String getTutorialProperty() {
		return tutorialProperty;
	}

	public void setTutorialProperty(String tutorialProperty) {
		this.tutorialProperty = tutorialProperty;
	}

}
