// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.cloud.spanner.pgadapter.metadata;

import java.util.List;

/** Simple POJO to hold describe metadata specific to prepared statements. */
public class DescribeStatementMetadata extends DescribeMetadata<List<Integer>> {

  public DescribeStatementMetadata(List<Integer> metadata) {
    this.metadata = metadata;
  }
}
