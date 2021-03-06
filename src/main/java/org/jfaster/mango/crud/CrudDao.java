/*
 * Copyright 2014 mango.jfaster.org
 *
 * The Mango Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.jfaster.mango.crud;

import org.jfaster.mango.annotation.UseSqlGenerator;
import org.jfaster.mango.descriptor.Generic;
import org.jfaster.mango.page.Page;
import org.jfaster.mango.page.PageResult;
import org.jfaster.mango.page.Sort;

import java.util.List;
import java.util.Optional;

/**
 * @author ash
 */
@UseSqlGenerator(CrudSqlGenerator.class)
public interface CrudDao<T, ID> extends Generic<T, ID> {

  void add(T entity);

  long addAndReturnGeneratedId(T entity);

  void add(Iterable<T> entities);

  T getById(ID primaryKey);

  Optional<T> findById(ID primaryKey);

  List<T> findByIds(Iterable<ID> primaryKeys);

  long count();

  int update(T entity);

  int[] update(Iterable<T> entities);

  int delete(ID primaryKey);

  List<T> findAll();

  PageResult<T> findAll(Page page);

  List<T> findAll(Sort sort);

}
