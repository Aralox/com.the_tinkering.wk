/*
 * Copyright 2019-2020 Ernst Jan Plugge <rmc@dds.nl>
 *
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

package com.the_tinkering.wk.db.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Room entity for the log_record table. This is where debug log records are stored.
 * Each row also contains the length of its message, to make it easier to trim excess
 * entries.
 */
@Entity(tableName = "log_record")
public final class LogRecord {
    /**
     * Primary key.
     */
    @PrimaryKey(autoGenerate = true)
    public long id = 0L;

    /**
     * Timestamp when the event was generated.
     */
    @ColumnInfo(defaultValue = "0")
    public long timestamp = 0L;

    /**
     * The tag (class name) for this record.
     */
    @ColumnInfo(defaultValue = "")
    @NonNull
    public String tag = "";

    /**
     * The length of the message string.
     */
    @ColumnInfo(defaultValue = "0")
    public int length = 0;

    /**
     * The log message.
     */
    @ColumnInfo(defaultValue = "")
    @NonNull
    public String message = "";
}
