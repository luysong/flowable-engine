/* Licensed under the Apache License, Version 2.0 (the "License");
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
 */
package org.flowable.cmmn.engine.impl.parser;

import org.flowable.cmmn.engine.impl.behavior.MilestoneActivityBehavior;
import org.flowable.cmmn.engine.impl.behavior.StageActivityBehavior;
import org.flowable.cmmn.engine.impl.behavior.TaskActivityBehavior;
import org.flowable.cmmn.model.Milestone;
import org.flowable.cmmn.model.PlanItem;
import org.flowable.cmmn.model.Stage;
import org.flowable.cmmn.model.Task;

public class DefaultCmmnActivityBehaviorFactory implements CmmnActivityBehaviorFactory {

    @Override
    public TaskActivityBehavior createTaskActivityBehavior(PlanItem planItem, Task task) {
        return new TaskActivityBehavior(task.isBlocking());
    }

    @Override
    public StageActivityBehavior createStageActivityBehavoir(PlanItem planItem, Stage stage) {
        return new StageActivityBehavior(stage);
    }
    
    @Override
    public MilestoneActivityBehavior createMilestoneActivityBehavior(PlanItem planItem, Milestone milestone) {
        return new MilestoneActivityBehavior();
    }

}
