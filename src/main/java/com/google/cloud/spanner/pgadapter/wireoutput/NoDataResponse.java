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

package com.google.cloud.spanner.pgadapter.wireoutput;

import java.io.DataOutputStream;
import java.text.MessageFormat;

/** Signals the end of a describe statement. */
public class NoDataResponse extends WireOutput {

  public NoDataResponse(DataOutputStream output) {
    super(output, 4);
  }

  @Override
  protected void sendPayload() throws Exception {
    // Do nothing
  }

  @Override
  public byte getIdentifier() {
    return 'n';
  }

  @Override
  protected String getMessageName() {
    return "No Data";
  }

  @Override
  protected String getPayloadString() {
    return new MessageFormat("Length: {0}").format(new Object[] {this.length});
  }
}