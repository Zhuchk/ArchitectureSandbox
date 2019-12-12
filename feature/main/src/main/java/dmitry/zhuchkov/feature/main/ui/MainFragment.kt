package dmitry.zhuchkov.feature.main.ui

import dmitry.zhuchkov.component.mvp.MVPFragment
import dmitry.zhuchkov.feature.main.R
import dmitry.zhuchkov.feature.main.presentation.MainPresenter
import dmitry.zhuchkov.feature.main.presentation.MainView
import kotlinx.android.synthetic.main.main_fragment.*
import javax.inject.Inject

/**
 * Created by Dmitrii on 12.12.2019
 *
 */
class MainFragment : MVPFragment(), MainView {

    override val layoutRes: Int = R.layout.main_fragment

    @Inject
    lateinit var presenter: MainPresenter

    override fun setupView() {
        initListeners()
    }

    private fun initListeners() {
        buttonMvvmExample.setOnClickListener { presenter.onMvvmExampleClicked() }
        buttonBottomNavigationExample.setOnClickListener { presenter.onBottomNavigationExampleClicked() }
        buttonDrawerNavigationExample.setOnClickListener { presenter.onDrawerNavigationExampleClicked() }
        buttonDynamicFeatureExample.setOnClickListener { presenter.onDynamicFeatureExampleClicked() }
        buttonLanguageChangeExample.setOnClickListener { presenter.onLanguageChangeExampleClicked() }
        buttonErrorHandlingExample.setOnClickListener { presenter.onErrorHandlingExampleClicked() }
        buttonDesignSystemExample.setOnClickListener { presenter.onEDesignSystemExampleClicked() }
    }
}