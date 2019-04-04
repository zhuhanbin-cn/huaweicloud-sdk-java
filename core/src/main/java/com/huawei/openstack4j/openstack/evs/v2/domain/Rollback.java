 /*******************************************************************************
  * 	Copyright 2019 Huawei Technologies Co.,Ltd.
  *
  * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
  * 	use this file except in compliance with the License. You may obtain a copy of
  * 	the License at
  *
  * 	    http://www.apache.org/licenses/LICENSE-2.0
  *
  * 	Unless required by applicable law or agreed to in writing, software
  * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  * 	License for the specific language governing permissions and limitations under
  * 	the License.
 *******************************************************************************/
package com.huawei.openstack4j.openstack.evs.v2.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huawei.openstack4j.model.ModelEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

 @Getter
 @ToString
 @Builder
 @NoArgsConstructor
 @AllArgsConstructor
 public class Rollback implements ModelEntity
 {

     private static final long serialVersionUID = 2919967032153591537L;

     /**
      * 回滚的目标云硬盘UUID。
      */
     @JsonProperty("volume_id")
     private String volumeId;

     /**
      * 回滚的目标云硬盘名称。最大支持255个字节。回滚的目标云硬盘名称。最大支持255个字节。
      * name不能单独传，若传name，必须带上对应的volume_id。
      */
     @JsonProperty("name")
     private String name;

 }
