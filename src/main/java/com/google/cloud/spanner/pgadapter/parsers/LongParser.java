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

package com.google.cloud.spanner.pgadapter.parsers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/** Translate from wire protocol to long. */
public class LongParser extends Parser<Long> {

  public LongParser(ResultSet item, int position) throws SQLException {
    this.item = item.getLong(position);
  }

  public LongParser(Object item) {
    this.item = (Long) item;
  }

  public LongParser(byte[] item) {
    this.item = Long.valueOf(new String(item));
  }

  @Override
  public Long getItem() {
    return this.item;
  }

  @Override
  protected String stringParse() {
    return Long.toString(this.item);
  }

  @Override
  protected byte[] binaryParse() {
    return toBinary(this.item, Types.BIGINT);
  }
}
