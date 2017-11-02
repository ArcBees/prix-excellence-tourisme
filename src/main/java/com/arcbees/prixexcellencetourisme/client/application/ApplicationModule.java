/**
 * Copyright 2014 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.arcbees.prixexcellencetourisme.client.application;

import com.arcbees.prixexcellencetourisme.client.application.alreadyvoted.AlreadyVotedModule;
import com.arcbees.prixexcellencetourisme.client.application.confirmvote.ConfirmVoteModule;
import com.arcbees.prixexcellencetourisme.client.application.home.HomeModule;
import com.arcbees.prixexcellencetourisme.client.application.identification.IdentificationModule;
import com.arcbees.prixexcellencetourisme.client.application.voteinactive.VoteInactiveModule;
import com.arcbees.prixexcellencetourisme.client.application.page404.Page404Module;
import com.arcbees.prixexcellencetourisme.client.application.thanks.ThanksModule;
import com.arcbees.prixexcellencetourisme.client.application.vote.VoteModule;
import com.arcbees.prixexcellencetourisme.client.application.votefinished.VoteFinishedModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new AlreadyVotedModule());
        install(new ConfirmVoteModule());
        install(new VoteInactiveModule());
        install(new VoteModule());
        install(new HomeModule());
        install(new ThanksModule());
        install(new IdentificationModule());
        install(new VoteFinishedModule());
        install(new Page404Module());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);

    }
}
