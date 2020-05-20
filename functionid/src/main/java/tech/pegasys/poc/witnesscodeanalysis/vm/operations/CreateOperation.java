/*
 * Copyright ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package tech.pegasys.poc.witnesscodeanalysis.vm.operations;


public class CreateOperation extends AbstractCreateOperation {

  public CreateOperation() {
    super(0xF0, "CREATE", 3, 1, 1);
  }

//  @Override
//  protected Address targetContractAddress(final MessageFrame frame) {
//    final Account sender = frame.getWorldState().get(frame.getRecipientAddress());
//    // Decrement nonce by 1 to normalize the effect of transaction execution
//    return Address.contractAddress(frame.getRecipientAddress(), sender.getNonce() - 1L);
//  }
}
