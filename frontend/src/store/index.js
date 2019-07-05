import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)
// 스토어 생성
const store = new Vuex.Store({
  // 스테이트
  state: {
    // count: 0
    customerId: 'hong'
  },
  mutations: {

  },
  getters: {

  },
  actions: {

  }
})

console.log(store.state.count)
